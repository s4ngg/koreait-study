
function Child({numbers}) {
    console.log(numbers)

    // 1.변수에 넣고 출력
    const doubleNumbers = numbers.map(numbers => numbers*2);

    return (
        <>
            <p>Child 입니다.</p>
            {/* <p>{doubleNumbers}</p> */}
            <ul>
                {/*numbers.map((number,index) => {
                    return <li key={index}>{number}</li>
                }) */}
                {/* 3보다 큰 요소만 렌더링 */}

                {numbers
                    .filter(num => num > 3)
                    .map((num, idx) => {
                        return <li key={idx}>{num}</li>
                    }) 
                }
            </ul>
        </>
    )
}

export default Child;