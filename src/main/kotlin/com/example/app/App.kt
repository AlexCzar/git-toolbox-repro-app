/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.example.app

import com.example.lib.Library

class App {
    val libraryInitialized = Library().someLibraryMethod()
}

fun main() {
    println(App().libraryInitialized)
}
