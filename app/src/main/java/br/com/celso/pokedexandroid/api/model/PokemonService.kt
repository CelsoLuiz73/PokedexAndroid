package br.com.celso.pokedexandroid.api.model

import br.com.celso.pokedexandroid.api.model.PokemonApiResult
import br.com.celso.pokedexandroid.api.model.PokemonsApiResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface PokemonService {
    @GET("pokemon")
    fun listPokemons(@Query("limit") limit: Int): Call<PokemonsApiResult>

    @GET("pokemon/{number}")
    fun getPokemon(@Path("number") number: Int): Call<PokemonApiResult>
}