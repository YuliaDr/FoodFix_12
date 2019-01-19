package com.example.user.foodfix_12.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.foodfix_12.R;

import java.util.ArrayList;
import java.util.List;

public class CardsAdapter extends RecyclerView.Adapter<CardsAdapter.CardViewHolder> {

    private final List<Card> cards;

    public CardsAdapter() {
        cards = new ArrayList<>();
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_view, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        Card card = cards.get(position);
        holder.title.setText(card.getTitle());
        holder.message_time.setText(card.getMessage_time());
        holder.message_pay.setText(card.getMessage_pay());
        holder.message_status.setText(card.getMessage_status());
        holder.message_place.setText(card.getMessage_place());
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    public void addCards(List<Card> items) {
        cards.addAll(items);
    }

    static class CardViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView message_time;
        TextView message_pay;
        TextView message_status;
        TextView message_place;

        CardViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.card_title);
            message_time = itemView.findViewById(R.id.card_message_time);
            message_pay = itemView.findViewById(R.id.card_message_pay);
            message_status = itemView.findViewById(R.id.card_message_status);
            message_place = itemView.findViewById(R.id.card_message_place);
        }
    }

}