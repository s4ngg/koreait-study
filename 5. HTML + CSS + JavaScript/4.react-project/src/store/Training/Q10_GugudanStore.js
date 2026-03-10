import { create } from "zustand";

const useGugudan = create((set) => ({
    a: 0,
    b: 0,
    c: 0,
    setA:(newA) => set({a: newA}),
    setB:(newB) => set({b: newB}),
    setC:(newC) => set({c: newC}),
    checkAnswer: () => set((state) => ({
        isAnswer: Number(state.c) === state.a * state.b
    })),
    reset: () => set({a:0, b:0, c:0, inAnswer: null})

    // checkAnswer: () => { //정답 확인함수
        // get() : 현재 저장소의 상태(state)를 불러오는 함수
        // const {a, b, c} = get();    
        // const resultCheck = Number(a) * Number(b) === Number(c);
        // set({ result: resultCheck ? '정답입니다!' : '오답입니다!'});
        // }
}))



export default useGugudan;