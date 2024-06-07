package com.example.locationapp



import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


class LocationViewModel: ViewModel() {
    private  val _location = mutableStateOf<LocationData?>(null)
    //mutableStateOf in the LocationViewModel class is significant because it allows the class to manage and observe changes in the location data in a reactive manner.
    val location: State<LocationData?> = _location


    fun updateLocation(newLocation:LocationData){
        _location.value = newLocation
    }
}