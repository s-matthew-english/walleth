package org.walleth.data.transactions

import org.walleth.data.Observeable
import org.walleth.data.WallethAddress

interface TransactionProvider : Observeable {

    fun getTransactionsForAddress(address: WallethAddress): List<Transaction>
    fun getLastNonceForAddress(address: WallethAddress): Long

    fun getTransactionForHash(hash: String): Transaction?

    fun getAllTransactions(): List<Transaction>

    fun addTransaction(transaction: Transaction)
    fun addTransactions(transactions: List<Transaction>)

    fun getPendingTransactions(): List<Transaction>
    fun addPendingTransaction(transaction: Transaction)

    fun popPendingTransaction(): Transaction?

    fun updateTransaction(oldTxHash: String,transaction: Transaction)

}