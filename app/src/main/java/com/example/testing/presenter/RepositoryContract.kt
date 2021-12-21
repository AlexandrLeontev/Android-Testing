package com.example.testing.presenter

import com.example.testing.model.SearchResponse
import com.example.testing.repository.RepositoryCallback
import io.reactivex.Observable

interface RepositoryContract {

    fun searchGithub(
        query: String,
        callback: RepositoryCallback
    )

    fun searchGithub(
        query: String
    ): Observable<SearchResponse>
}
