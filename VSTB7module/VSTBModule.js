import { NativeModules } from "react-native";

const VSTBModule =NativeModules.VSTBManager;
export const initializeVSTB =async()=>{
    return VSTBModule.initializeVSTB();
}

export const startPlayback=async()=>{
    return VSTBModule.startPlayback();
}

export const pausePlayback=async()=>{
    return VSTBModule.pausePlayback();
}