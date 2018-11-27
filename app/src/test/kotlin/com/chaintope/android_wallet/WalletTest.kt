package com.chaintope.android_wallet

import org.bitcoinj.params.RegTestParams
import org.bitcoinj.wallet.Wallet
import org.junit.Assert
import org.junit.Assert.*
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object WalletTest: Spek({
    describe("wallet") {
        val wallet by memoized {
            Wallet(RegTestParams.get())
        }
        describe("create wallet") {
            it("chainseed is not empty") {
                assertNotEquals("", wallet.keyChainSeed.toString())
            }
            it("print test") {
                print("testtest")
                assertTrue(true)
            }
        }
    }
})