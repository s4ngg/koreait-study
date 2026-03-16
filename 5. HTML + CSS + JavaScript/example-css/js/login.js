const VALID_EMAIL = 'hong@example.com';
const VALID_PASSWORD = 'qwer1234';
const REDIRECT_URL = '../pages/user-list.html';

const emailInput = document.getElementById('email');
const passwordInput = document.getElementById('password');
const loginBtn = document.getElementById('loginBtn');
const errorMsg = document.getElementById('errorMsg');

// 로그인 버튼 클릭
loginBtn.addEventListener('click', handleLogin);

// Enter 키로 로그인
emailInput.addEventListener('keydown', function (e) {
    if (e.key === 'Enter') handleLogin();
});

passwordInput.addEventListener('keydown', function (e) {
    if (e.key === 'Enter') handleLogin();
});

// 입력 시 에러 메시지 숨기기
emailInput.addEventListener('input', function () {
    errorMsg.classList.remove('show');
});

passwordInput.addEventListener('input', function () {
    errorMsg.classList.remove('show');
});

// 로그인 처리 함수
function handleLogin() {
    var email = emailInput.value.trim();
    var password = passwordInput.value;

    if (email === VALID_EMAIL && password === VALID_PASSWORD) {
        location.href = REDIRECT_URL;
    } else {
        errorMsg.classList.add('show');
        passwordInput.value = '';
        passwordInput.focus();
    }
}