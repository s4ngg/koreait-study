function Fruit({fruitList}){
    return(
        <ul>
            {
                fruitList.map((fruitList, idx) => {
                    return <li key={idx}>{fruitList}</li>
                })
            }
        </ul>
    )
}

export default Fruit;