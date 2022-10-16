package com.example.genericspractice

import com.example.genericspractice.AvailableBalanceNegatorExtension.negateBalance
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.math.BigDecimal

internal class NegatorTest {
    @Test
    fun shouldReturnNegativeBalance() {

        val depositAccount = DepositAccount(BigDecimal.valueOf(200))
//        var loanAccount = LoanAccount(BigDecimal.valueOf(200))
        val negator = Negator(depositAccount)
        val result = negator.negate(depositAccount)
        val expectedResult: BigDecimal = BigDecimal.valueOf(-200)
        Assertions.assertThat(expectedResult.equals(result)).isTrue
    }

    @Test
    fun shouldReturnNegativeBalanceByExtension(){
        var depositAccount = DepositAccount(BigDecimal.valueOf(500))
        val expectedResult = BigDecimal.valueOf(-500)
        val result = depositAccount.negateBalance(depositAccount)
        Assertions.assertThat(expectedResult.equals(result)).isTrue

    }

}