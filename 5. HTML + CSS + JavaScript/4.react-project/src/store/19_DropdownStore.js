import { create } from "zustand";

const DropDownStore = create((set) => ({
    selectionOption: '',
    setSelectOption: (value) => set({selectOption: value})
}))

export default DropDownStore;