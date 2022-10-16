package com.example.genericspractice

import java.math.BigDecimal

class Negator(var account: DepositAccount){

    fun negate(account : DepositAccount) : BigDecimal{
        return account.availableBalance.multiply(BigDecimal.valueOf(-1))
    }

}