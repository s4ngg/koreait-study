function EvenList({evenNum}){
    return(
        <ul>
            {evenNum
                .filter(num => num % 2 == 0)
                .map((num,idx) =>{
                    return <p key={idx}>{num}</p>
                })
            }
        </ul>
        )
}
export default EvenList;