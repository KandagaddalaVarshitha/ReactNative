import React from'react';

import {View,Text,Button}from 'react-native';
import { initializeVSTB,startPlayback,pausePlayback } from './VSTBModule';

export const PlayerComponent=()=>{
    const handlePaly= async()=>{
        try{
            await initializeVSTB();
            await startPlayback();
            console.log("PlayBack started")
        }
        catch(error){
            console.log("Failed to start Palyback",error)
        }
    }

    const handlePause=async()=>{
        try{
            await initializeVSTB();
            await pausePlayback();
            console.log("Playback Paused");

        }catch(error){
            console.log("Failed to Pause Playback",error);
        }
    }
    return(
        <View>
        <Button title='Play' onPress={handlePaly}/>
        <Button title='Pause' onPress={handlePause}/>
        </View>
    )
}