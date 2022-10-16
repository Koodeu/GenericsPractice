package com.example.genericspractice

import org.springframework.stereotype.Component
import java.math.BigDecimal

@Component
data class DepositAccount(var availableBalance : BigDecimal) : Account(availableBalance)
