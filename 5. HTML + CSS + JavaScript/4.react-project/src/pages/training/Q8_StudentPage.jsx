import StudentList from "../../components/training/Q8_StudentList";

function StudentPage(){
    return(
        <StudentList student={[
            {name:"김학생", score: 90},
            {name:"이학생", score: 80}
        ]}></StudentList>
    )
}

export default StudentPage;