package com.example.genericspractice

import java.math.BigDecimal

object AvailableBalanceNegatorExtension {

    fun DepositAccount.negateBalance(account: DepositAccount): BigDecimal {
        return account.availableBalance.multiply(BigDecimal.valueOf(-1))
    }

}