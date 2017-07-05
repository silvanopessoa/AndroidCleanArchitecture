package br.com.missao.cleanarchitecture.injections.modules.system

import br.com.missao.cleanarchitecture.apis.reddit.RedditAPI
import br.com.missao.cleanarchitecture.loggers.Logger
import br.com.missao.cleanarchitecture.mvp.MainMvpModelOperations
import com.nhaarman.mockito_kotlin.mock
import org.assertj.core.api.Assertions
import org.junit.Test

/**
 * Testes for class [DomainModule]
 */
class DomainModuleTest {

    val api: RedditAPI = mock()
    val logger: Logger = mock()
    val module: DomainModule = DomainModule()

    @Test
    fun provides() {
        val result = module.providesMainDomain(api, logger)
        Assertions.assertThat(result).isInstanceOf(MainMvpModelOperations::class.java)
    }

}