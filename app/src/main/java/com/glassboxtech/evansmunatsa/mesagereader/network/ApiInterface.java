package com.glassboxtech.evansmunatsa.mesagereader.network;

import com.glassboxtech.evansmunatsa.mesagereader.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by evansmunatsa on 2018/10/02.
 */

public interface ApiInterface {

    @GET("inbox.json")
    Call<List<Message>> getInbox();
}
