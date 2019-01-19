package com.example.user.foodfix_12.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.foodfix_12.R;

import java.util.ArrayList;
import java.util.List;

public class CardsFragment extends Fragment {

    private RecyclerView cardsRecycler;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cards_fragment_layout, container, false);
        cardsRecycler = view.findViewById(R.id.cards_recycler);
        cardsRecycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        CardsAdapter adapter = new CardsAdapter();
        cardsRecycler.setAdapter(adapter);
        adapter.addCards(createCards());
        adapter.notifyDataSetChanged();
        return view;
    }

    private List<Card> createCards() {
        List<Card> cards = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Card card = new Card("Заказ №" + i, "Время: ЧЧ:ММ", "Оплата: " + i*127 + "\u20BD", "Статус: Принят", "Место: Название ресторана");
            cards.add(card);
        }
        return cards;
    }
}
