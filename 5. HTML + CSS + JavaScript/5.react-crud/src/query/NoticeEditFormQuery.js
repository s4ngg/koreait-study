import { useQuery } from "@tanstack/react-query"
import { NoticeDetailApi } from "../api/boardApi"  // ✅ 상세 조회 API로 변경!

export const useNoticeEditFormQuery = (id) => {
    return useQuery({
        queryKey: ['noticeEdit', id],
        queryFn: () => NoticeDetailApi(id),  // ✅ 상세 조회 API로 변경!
        enabled: !!id,
        staleTime: 0,
        retry: 1,
    })
}