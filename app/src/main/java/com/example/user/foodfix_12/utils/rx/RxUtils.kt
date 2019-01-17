package com.example.user.foodfix_12.utils.rx

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created by bagrusss on 18.01.2019
 */

operator fun CompositeDisposable.plusAssign(d: Disposable) {
    add(d)
}

operator fun CompositeDisposable.minusAssign(d: Disposable) {
    remove(d)
}