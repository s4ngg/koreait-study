import { useState } from "react";

function InputField(){
    const [name, setName] = useState('');
    const [email, setEmail] = useState('');

    // function handleName(e) {
    //     setName(e.target.value)
    // }

    // function handleEmail(e){ 
    //     setEmail(e.target.value)

    // }
    return (
        <form action="">
            <input type="text" onChange={(e) => setName(e.target.value)}/>
            <input type="text" onChange={(e) => setEmail(e.target.value)} />
        </form>
    )
}

export default InputField;