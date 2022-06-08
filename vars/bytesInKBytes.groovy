#!/usr/bin/env groovy

def call(o_used, o_total, a_used, a_total) {
    def o_used_kb = o_used.div(1024)
    def o_total_kb = o_total.div(1024)
    def o_used_total = o_used_kb*100.div(o_total_kb)
    
    def a_used_kb = a_used.div(1024)
    def a_total_kb = a_total.div(1024)
    def a_used_total = a_used_kb*100.div(a_total_kb)

    println ('O: used in kB ' + o_used_kb.round(2) + ' total in kB ' + o_total_kb.round(2) + ' used of total ' + o_used_total.round(2) + '%')
    println ('A: used in kB ' + a_used_kb.round(2) + ' total in kB ' + a_total_kb.round(2) + ' used of total ' + a_used_total.round(2) + '%')
}

return this;
