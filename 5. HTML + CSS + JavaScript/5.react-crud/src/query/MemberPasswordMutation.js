import { useMutation } from "@tanstack/react-query"
import { memberPasswordApi } from "../api/memberApi"


export const useMemberPasswordMutation = () => {
    return useMutation({
        mutationFn: (FormData) => memberPasswordApi(FormData),
        onSuccess: () => {
            alert('비밀번호가 변경되었습니다.');
        }
    })
}