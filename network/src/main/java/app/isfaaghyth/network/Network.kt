package app.isfaaghyth.network

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.isfaaghyth.network.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by isfaaghyth on 20/04/19.
 * github: @isfaaghyth
 */

const val REQUEST_TIME_OUT = 60L

fun httpClient(): OkHttpClient {
    val httpLoggingInterceptor = HttpLoggingInterceptor()
    httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

    return OkHttpClient.Builder()
        .connectTimeout(REQUEST_TIME_OUT, TimeUnit.SECONDS)
        .readTimeout(REQUEST_TIME_OUT, TimeUnit.SECONDS)
        .addInterceptor(httpLoggingInterceptor).build()
}

inline fun <reified T> services(okHttpClient: OkHttpClient): T {
    val gson = GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        .setLenient()
        .create()

    val retrofit = Retrofit.Builder()
        .baseUrl(BuildConfig.GITHUB_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build()

    return retrofit.create(T::class.java)
}