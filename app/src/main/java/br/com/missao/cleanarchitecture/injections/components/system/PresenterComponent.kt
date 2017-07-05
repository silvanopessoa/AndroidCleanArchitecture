package br.com.missao.cleanarchitecture.injections.components.system

import br.com.missao.cleanarchitecture.injections.modules.system.*
import br.com.missao.cleanarchitecture.mvp.MainMvpPresenterOperations
import dagger.Component
import javax.inject.Singleton

/**
 * Application's presenter component
 */
@Singleton
@Component(modules = arrayOf(RetrofitModule::class, ApiModule::class, LoggerModule::class,
        DomainModule::class, PresenterModule::class))

interface PresenterComponent {

    fun getMainMvpPresenterOperations(): MainMvpPresenterOperations
}