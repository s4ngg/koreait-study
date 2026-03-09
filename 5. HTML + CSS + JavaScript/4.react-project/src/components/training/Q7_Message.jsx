function Message({isTrue}){
    return(
        <h3>{isTrue ? "안녕하세요" : "반갑습니다."}</h3>
    );
}

export default Message;