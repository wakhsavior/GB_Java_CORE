SRC_DIR := src
OUT_DIR := out
DOC_DIR := doc

JC := javac
JDOC := javadoc
JSRC := -sourcepath ./$(SRC_DIR)
JCLASS := -cp ./$(OUT_DIR)
JCDEST := -d $(OUT_DIR)
JDOCDEST := -d $(OUT_DIR)
MAIN_SOURCE := main/java/Seminar_01_HW/Main
MAIN_CLASS := main.javaj.Seminar_01_HW.Main

all:
	${JC} ${JSRC} ${JCDEST} ${SRC_DIR}/${MAIN_SOURCE}.java

clean:
	rm -R ${OUT_DIR} &&  rm -R notebook.txt

run:
	cd out && java ${MAIN_CLASS}

docs:
	${JDOC} ${JDOCDEST} ${JSRC} ${JCLASS} 	-subpackages ru

 
