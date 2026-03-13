import { useParams } from "react-router-dom";
import { useNoticeEditFormQuery } from "../query/NoticeEditFormQuery";
import { useEffect, useState } from "react";
import { useQuillEditorHook } from "../hooks/useQuillEditorHook";
import { useFileUploadHook } from "./useFileUploadHook";
import { useNoticeEditMutation } from "../query/NoticeEditMutation";

export const useNoticeEditHook = () => {
    const { id } = useParams();
    const [category, setCategory] = useState('');
    const [title, setTitle] = useState('');
    const { quillRef } = useQuillEditorHook();
    const { selectedFiles, imagePreview, handleImageChange } = useFileUploadHook();
    const { data: boardDTO, isLoading, isError } = useNoticeEditFormQuery(id);
    const { mutate: noticeEdit } = useNoticeEditMutation();

    useEffect(() => {
        if (boardDTO) {
            setTitle(boardDTO.title || '');
            setCategory(boardDTO.category || '공지');

            // ✅ 이거 추가! Quill 에디터에 기존 내용 세팅
            if (quillRef.current) {
                quillRef.current.root.innerHTML = boardDTO.content || '';
            }
        }
    }, [boardDTO])

    const handleSubmit = (e) => {
        e.preventDefault();
        const content = quillRef.current.root.innerHTML;

        console.log("category:", category);  // ✅ 추가
        console.log("title:", title);        // ✅ 추가
        console.log("content:", content);    // ✅ 추가

        const formData = new FormData();
        formData.append("title", title);
        formData.append("content", content);
        formData.append("category", category);

        selectedFiles.forEach(file => {
            formData.append("files", file);
        })

        noticeEdit({ postId: id, formData });
    }

    return {
        id,
        category,
        title,
        boardDTO,
        selectedFiles,
        imagePreview,
        quillRef,
        handleSubmit,
        setCategory,
        setTitle,
        handleImageChange,
        isLoading,
        isError
    };
}