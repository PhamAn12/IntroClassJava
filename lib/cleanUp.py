#!/usr/bin/env python

import json
import os
import shutil

def listdir_fullpath(d):
	return [f for f in os.listdir(d) if os.path.isdir(os.path.join(d, f))]

rootDataset = os.path.join(os.path.dirname(__file__), '../dataset/')
introclassJSONPath = os.path.join(os.path.dirname(__file__), '../dataset/introclass.json')
introclassJSONFile = open(introclassJSONPath)
data = json.load(introclassJSONFile)

for dirName, subdirList, fileList in os.walk(os.path.join(rootDataset, "**/*.java")):
    print('Found directory: %s' % dirName)
    for fname in fileList:
        print('\t%s' % fname)

count = 0
programs = listdir_fullpath(rootDataset)
for program in programs:
	users = listdir_fullpath(os.path.join(rootDataset, program))
	for user in users:
		versions = listdir_fullpath(os.path.join(rootDataset, program, user))
		for version in versions:
			if os.path.join(program, user, version) not in data:
				count += 1
				shutil.rmtree(os.path.join(rootDataset, program, user, version), ignore_errors=True)
			else:
				javaFile = os.path.join(rootDataset, program, user, version, "src/main/java/introclassJava/%s_%s_%s.java" % (program, user, version))
				continue
				if os.path.isfile(javaFile):
					newJavaFile = os.path.join(rootDataset, program, user, version, "src/main/java/introclassJava/%s_%s_%s.java" % (program, user[0:8], version))
					os.rename(javaFile, newJavaFile)


print count