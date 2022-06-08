#!/usr/bin/env groovy

def bytesInKBytes() {
    def o_used = 1193555
    def o_total = 1193814
    def a_used = 120931
    def a_total = 122132
    def o_used_kb = o_used.div(1024)
    def o_total_kb = o_total.div(1024)
    def o_used_total = o_used_b*100.div(o_total_b)
    
    def a_used_kb = a_used.div(1024)
    def a_total_kb = a_total.div(1024)
    def a_used_total = a_used_b*100.div(a_total_b)

    println ('O: used in kB ' + o_used_kb + ' total in kB ' + o_total_kb  + ' used of total ' + o_used_total)
    println ('A: used in kB ' + a_used_kb  + ' total in kB ' + a_total_kb + ' used of total ' + a_used_total)
}

return this;
