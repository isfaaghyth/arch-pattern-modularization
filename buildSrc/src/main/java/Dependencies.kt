/**
 * Created by isfaaghyth on 19/02/19.
 * github: @isfaaghyth
 */

object ApplicationId {
    val id = "app.isfaaghyth.git"
}

object Releases {
    val versionCode = 1
    val versionName = "1.0"

    val compileSdkVersion = 28
    val targetSdkVersion = 28
    val minSdkVersion = 17
}

object Versions {

    const val kotlin            = "1.3.11"
    const val android_support   = "28.0.0"
    const val constraint        = "1.1.3"
    const val anko              = "0.10.5"
    const val retrofit          = "2.5.0"
    const val rxretrofit        = "2.4.0"
    const val okhttp_logging    = "3.11.0"
    const val rxandroid         = "2.0.2"
    const val rxkotlin          = "2.3.0"
    const val glide             = "4.8.0"
    const val dagger            = "2.21"

    //testing
    const val jUnit             = "4.12"
    const val testRunner        = "1.0.2"
    const val espresso          = "3.0.2"
    const val mockito           = "2.8.47"
    const val mockKotlin        = "2.1.0"
    const val mockTestRunner    = "0.3.1"
}

object Dependencies {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
}

object AndroidSupport {
    val appCompat = "com.android.support:appcompat-v7:${Versions.android_support}"
    val design = "com.android.support:design:${Versions.android_support}"
    val constraint = "com.android.support.constraint:constraint-layout:${Versions.constraint}"
}

object Retrofit {
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    val scalarConverter = "com.squareup.retrofit2:converter-scalars:${Versions.retrofit}"
    val rxAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.rxretrofit}"
    val okHttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp_logging}"
}

object Reactivex {
    val android = "io.reactivex.rxjava2:rxandroid:${Versions.rxandroid}"
    val kotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxkotlin}"
}

object Glide {
    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
}

object Dagger {
    val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    val android = "com.google.dagger:dagger-android:${Versions.dagger}"
    val androidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    val compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    val processor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
}

object Anko {
    val anko = "org.jetbrains.anko:anko:${Versions.anko}"
    val common = "org.jetbrains.anko:anko-commons:${Versions.anko}"
}

object Testing {
    val jUnit = "junit:junit:${Versions.jUnit}"
    val testRunner = "com.android.support.test:runner:${Versions.testRunner}"
    val espresso = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
    val mockito = "org.mockito:mockito-inline:${Versions.mockito}"
    val mockKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockKotlin}"
    val mockKtRunner = "de.jodamob.kotlin:kotlin-runner-junit4:${Versions.mockTestRunner}"
}