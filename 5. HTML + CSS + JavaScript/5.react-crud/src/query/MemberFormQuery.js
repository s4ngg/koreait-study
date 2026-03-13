import { useQuery } from "@tanstack/react-query"
import { memberInfoApi } from "../api/memberApi"


export const useMemberFormQuery = () => {
    return useQuery({
        queryKey:['memberInfo'],
        queryFn: memberInfoApi,
        enabled: true,
        refetchOnWindowFocus: true, // 다른 탭 갔다오면 다시 확인
        staleTime: 0 // 항상 최신 상태 확인
    })
}