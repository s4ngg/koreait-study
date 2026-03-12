import { useQuery } from "@tanstack/react-query"
import { NoticeDetailApi } from "../api/boardApi"

// 공지사항 상세보기
export const useNoticeDetailQuery = (postId) => {
    return useQuery({
        queryKey: ['noticeDetail', postId],
        queryFn: () => NoticeDetailApi(postId),
        enabled: !!postId, // postId가 있으면 true, 없으면 false
        staleTime: 60000, // 1분간 캐시 유지
        retry: 1
    })
}