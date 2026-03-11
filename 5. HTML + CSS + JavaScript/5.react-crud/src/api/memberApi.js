import axiosInstance from "./AxiosInstance"

export const registerMemberApi = async (formData) => {
    const response = await axiosInstance.post('/api/member/register', {
        userId: formData.userId,
        userName: formData.userName,
        email: formData.email,
        password: formData.password,
        passwordCheck: formData.passwordCheck
    })
}