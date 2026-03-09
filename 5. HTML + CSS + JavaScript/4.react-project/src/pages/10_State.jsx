import { useState } from "react";

export default function State(){
    // 1. 초기 상태 설정
    // 2. 상태 변수와 상태 변경 함수 생성
    // 3. 상태 업데이트
    const [count, setCount] = useState(0);

    function addCount() {
        // setCount (count + 1);
        // console.log(count);
        // alert("클릭하셨습니다!");
        // if(count >= 10){
        //     setCount(10);

        setCount(count => count+1);
        setCount(count => count+1);
        setCount(count => count+1);
        console.log(count);

        }
    return(
        <>
            <h2>{count}</h2>
            <button onClick={addCount}>클릭</button>
        </>
    )
}