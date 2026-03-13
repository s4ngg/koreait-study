import { useMutation, useQueryClient } from "@tanstack/react-query"
import { memberUpdateApi } from "../api/memberApi";

export const useMemberUpdateMutation = () => {
    const queryClient = useQueryClient();
    return useMutation({
        mutationFn: (formData) => memberUpdateApi(formData),
        onSuccess: () => {
            queryClient.invalidateQueries({
                queryKey: ['memberInfo']
            })
            alert('회원정보가 수정되었습니다.');
        }
    })

}