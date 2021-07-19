package com.example.plugin

object Versions {
    val okhttp = "5.0.0-alpha.2"
    val eventbus = "3.2.0"
    val glide = "4.12.0"
    val rxjava = "3.0.13"
    val mmkv = "1.2.10"
    val retrofit = "2.9.0"
}

object Dependencies {
    val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    val eventbus = "org.greenrobot:eventbus:${Versions.eventbus}"
    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    val rxjava = "io.reactivex.rxjava3:rxjava:${Versions.rxjava}"
    val mmkv = "com.tencent:mmkv-static:${Versions.mmkv}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
}