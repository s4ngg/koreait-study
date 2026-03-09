function Result({name, score}){
    return(
            <h3>{score > 60 ? name + " - 합격" : name + " - 불합격"}</h3>
    )
}

export default Result;