package variable
int x = 10
println x.class

double  y = 10.12
println(y.class)

def x_1 = 11
def y_1 = 22.33
def name = "android"
println(x_1.class)
println(y_1.class)
println(name.class)

def name1 = '啊\'\'single'
println name1.class
def name2 = '''
    锄禾日当午
    汗滴禾下锄
    谁知盘中餐
    粒粒皆辛苦  '''
println name2
println name2.class

def job = "Student"
def KK = "小明是 ${job}"
println KK
println KK.class
