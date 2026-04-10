import tensorflow as tf
import numpy as np

# 1. 학습 데이터
# X : 공부 시간
X = np.array([1,2,3,4,5], dtype="float")

# Y : 시험 점수
Y = np.array([50,55,65,70,80], dtype="float")

# 2. 모델 생성
model = tf.keras.models.Sequential([
    tf.keras.layers.Dense(units=1, input_shape=(1,), activation="sigmoid"),
])

# 3. 컴파일 (학습 과정)
model.compile(
    optimizer=tf.keras.optimizers.SGD(learning_rate=0.01),
    loss="mse"
)

# 4. 사용자로부터 입력받기
epochs = int(input("학습 횟수 입력 : "))

# 5. 학습 진행 + 로그 출력
for epoch in range(epochs):
    history = model.fit(X, Y, epochs=1, verbose=0)

    loss = history.history["loss"][0]

    w, b = model.layers[0].get_weights()

    print(f"Loss: {loss:.4f }")
    print(f"Weights: {w}")
    print(f"Bias: {b}")
    print("-"*30)

# 6. 예측 테스트
test_hour = 6
pred = model.predict(np.array([test_hour]))
print(f"공부 시간 {test_hour} -> 예측 점수 : {pred[0][0]}:.2f")
