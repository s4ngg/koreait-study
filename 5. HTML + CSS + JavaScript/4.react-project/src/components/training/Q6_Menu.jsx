function Menu({valData}){
    return(
        <ul>
            {
                valData.map((x,idx) => 
                    <li key={idx}>{x}</li>
                )
            }
        </ul>
    )
}

export default Menu;