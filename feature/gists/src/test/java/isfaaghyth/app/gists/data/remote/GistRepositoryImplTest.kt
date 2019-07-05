package isfaaghyth.app.gists.data.remote

import app.isfaaghyth.network.serviceCoroutines
import isfaaghyth.app.gists.data.GistServices
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class GistRepositoryImplTest {

    lateinit var services: GistServices

    @Before
    fun setUp() {
        services = serviceCoroutines()
    }

    @Test
    fun test_shouldValidData() {
        runBlocking {
            val data = services.getGithubGist("isfaaghyth").await()
            data.forEach(::println)
        }
    }

    @Test
    fun test_should404Request() {
        runBlocking {
            val notfound = services.getGithubGistError("isfaaghyth").await()
            notfound.forEach(::println)
        }
    }

}