package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        List<News> news = new ArrayList<>();
        news.add(new News("Timão Tem Desfalque Importante", "A tríplice coroa comemorada pelo time feminino do Corinthians em 2021 é apenas um combustível para a equipe buscar mais"));
        news.add(new News("Timão Joga no Sábado", "A tríplice coroa comemorada pelo time feminino do Corinthians em 2021 é apenas um combustível para a equipe buscar mais"));
        news.add(new News("mundial de clubes Feminino está Terminando", "A tríplice coroa comemorada pelo time feminino do Corinthians em 2021 é apenas um combustível para a equipe buscar mais"));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }
}