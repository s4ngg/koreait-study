import { useEffect, useState } from "react"
import { useMemberFormQuery } from "../query/MemberFormQuery";
import { useMemberUpdateMutation } from "../query/MemberUpdateMutation"
import { useMemberPasswordMutation } from "../query/MemberPasswordMutation"


export const useMemberHook = () =>{
    const [userName, setUserName] = useState('');
    const [email, setEmail] = useState('');
    const [currentPassword, setCurrentPassword] = useState('');
    const [newPassword, setNewPassword] = useState('');
    const [passwordCheck, setPasswordCheck] = useState('');

    const{ data: memberDTO, isLoading } = useMemberFormQuery();
    const{ mutate: memberUpdate } = useMemberUpdateMutation();
    const{ mutate: memberPassword } = useMemberPasswordMutation(); 

    useEffect(() =>{
        if (memberDTO) {
            setUserName(memberDTO.userName || '');
            setEmail(memberDTO.email || '');
        }
    }, [memberDTO])

    const handleUpdateSubmit = (e) => {
        e.preventDefault();
        memberUpdate({ userName, email });
    }

    const handlePasswordSubmit = (e) => {
        e.preventDefault();
        if (newPassword !== passwordCheck) {
            alert('새 비밀번호가 일치하지 않습니다.');
            return;
        }
        memberPassword({currentPassword, newPassword});
    }

    return {
        userName, setUserName,
        email, setEmail,
        currentPassword, setCurrentPassword,
        newPassword, setNewPassword,
        passwordCheck, setPasswordCheck,
        memberDTO, isLoading,
        handleUpdateSubmit, handlePasswordSubmit
    }
}