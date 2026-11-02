package com.graytsar.sensor.model

import android.hardware.Sensor
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Class for UI representation of sensor.
 */
data class UISensor(
    /**
     * Type of [Sensor]
     */
    val sensorType: Int,
    /**
     * Number of axes the sensor records.
     */
    val axes: Int,
    /**
     * Number of data points to display on the graph.
     */
    val dataPoints: Int,
    /**
     * Name of the sensor.
     */
    @param:StringRes
    val name: Int,
    /**
     * Unit of measurement for the sensor.
     */
    @param:StringRes
    val unit: Int,
    /**
     * Description of the sensor.
     */
    @param:StringRes
    val info: Int,
    /**
     * The color for the sensor.
     */
    @param:ColorRes
    val color: Int,
    /**
     * The icon for the sensor.
     */
    @param:DrawableRes
    val icon: Int
) {
    /**
     * Sensor event listener for [com.graytsar.sensor.ui.sensors.SensorsFragment]
     */
    var listener: ((Triple<Float, Float, Float>) -> Unit)? = null
}