import useGugudan from "../../store/Training/Q10_GugudanStore";


function Gugudan() {
    const {a, b, c, setA, setB, setC, isAnswer, checkAnswer, reset} = useGugudan();

    return(
        <>
            <select name="" id="">
                <option value="">a</option>
                <option value="">b</option>
                <option value="">c</option>
            </select>
            <div>
                <label htmlFor="number1">첫번째 수(a): </label>
                <input type="number" id="number1" value = {a} onChange={(e) => setA(e.target.value)}/>
            </div>
            <div>
                <label htmlFor="number2">두번째 수(b): </label>
                <input type="number" id="number2" value = {b} onChange={(e) => setB(e.target.value)}/>
            </div>
            <p>
                {/* 문제: a x b = ? 형식으로 보여야 함 */}
                문제: {a || '_'} x {b || '_'} = ?
            </p>
            <input type="number" value ={c} onChange={(e) => setC(e.target.value)}/>
            <button onClick={checkAnswer}>정답 확인</button>
            <button onClick={reset} style={{marginLeft: '10px'}} >초기화</button>

            {
                isAnswer === null ? null : (<p style={{marginTop: '10px'}}>{isAnswer ? '정답 입니다!' : '오답 입니다!'}</p>)
            }
        </>
    )
}

export default Gugudan;