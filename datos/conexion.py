import pymysql
conn = pymysql.connect(host='127.0.0.1',
                       user='root', passwd="", db='mysql')
cur = conn.cursor()

print(cur)
cur.execute("SELECT Host,User FROM user")
for r in cur:
    print(r)
cur.close()
conn.close()