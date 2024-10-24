/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package org.openCF

import com.google.gson.Gson
import org.checkerframework.checker.units.qual.UnknownUnits
import java.util.UUID
import kotlin.test.Test
import kotlin.test.assertTrue

class LibraryTest {


    @Test fun testingCircuitToJson() {




    }


   @Test fun JsonToCircuit(){
        var json = "{\"components\":[{\"componentName\":\"And\",\"componentId\":647,\"xLocation\":345,\"yLocation\":678,\"leftPins\":[],\"rightPins\":[],\"topPins\":[],\"bottomPins\":[]},{\"componentName\":\"Nand\",\"componentId\":748,\"xLocation\":305,\"yLocation\":878,\"leftPins\":[],\"rightPins\":[],\"topPins\":[],\"bottomPins\":[]},{\"componentName\":\"NE555\",\"componentId\":748,\"xLocation\":945,\"yLocation\":378,\"leftPins\":[],\"rightPins\":[],\"topPins\":[],\"bottomPins\":[]}],\"connections\":[{\"pinA\":{\"parentId\":748,\"pinOrient\":123,\"pinIndex\":345,\"pinId\":849,\"pinName\":\"PinA\"},\"pinB\":{\"parentId\":878,\"pinOrient\":123,\"pinIndex\":345,\"pinId\":849,\"pinName\":\"Pinsciis\"}},{\"pinA\":{\"parentId\":738,\"pinOrient\":123,\"pinIndex\":345,\"pinId\":536,\"pinName\":\"PinA\"},\"pinB\":{\"parentId\":748,\"pinOrient\":123,\"pinIndex\":345,\"pinId\":739,\"pinName\":\"PinA\"}},{\"pinA\":{\"parentId\":738,\"pinOrient\":123,\"pinIndex\":345,\"pinId\":748,\"pinName\":\"PinA\"},\"pinB\":{\"parentId\":849,\"pinOrient\":123,\"pinIndex\":345,\"pinId\":536,\"pinName\":\"PinA\"}}]}\n"

       
        var circuit = Gson().fromJson(json, ElectricalCircuit::class.java)
        println(circuit)
    }



    @Test fun uniqueIdTest(){
       val a = UUID.randomUUID()

        println(a.hashCode())

    }


}
