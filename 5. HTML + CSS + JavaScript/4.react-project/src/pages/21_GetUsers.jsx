import { useEffect } from "react";
import { useState } from "react";
import { getUser } from "../api/21_Axios";

function GetUsers(){
    const [users, setUsers] = useState([]);

    useEffect(() => {
        const feachUser = async () => {
            const data = await getUser();
            setUsers(data)
        }
        feachUser()
    })
    return (
        <>
            <h2>사용자 목록</h2>

            <ul>
                {users.map((user)=> (
                    <li key={user.id}>{user.name}</li>
                ))}
            </ul>
        </>
    );
}

export default GetUsers;