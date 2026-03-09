function StudentList({student}){
    return(
        <ul>
            {student.map((x,idx) => (
                <p key={idx}>{x.name} - {x.score}점</p>
            ))}
        </ul>
    )
}

export default StudentList;