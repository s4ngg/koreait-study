import { useState } from "react";
import Message from "../../components/training/Q7_Message";

function MessagePage() {
    const [isTrue, chgTrue] = useState(true);
    return(
        <>
            <Message isTrue={isTrue}></Message>
            <button onClick={() => chgTrue(false)}>클릭</button>
        </>
    );
}

export default MessagePage;